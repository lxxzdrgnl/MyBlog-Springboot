package me.lxxzdrgnl.springbootdeveloper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@DataJpaTest
class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;

    @Sql("/Insert-members.sql")
    @Test
    void getAllMembers() {
        List<Member> members = memberRepository.findAll();
        assertThat(members.size()).isEqualTo(3);
    }

    @Sql("/Insert-members.sql")
    @Test
    void getMemberById() {
        // when
        Member member = memberRepository.findByName("C").get();

        // then
        assertThat(member.getId()).isEqualTo(3);
    }

    @Test
    void saveMember() {
        Member member = new Member(1L, "A");
        memberRepository.save(member);
        assertThat(memberRepository.findById(1L).get().getName()).isEqualTo("A");
    }

    @Sql("/Insert-members.sql")
    @Test
    void deleteMemberById() {
        memberRepository.deleteById(2L);
        assertThat(memberRepository.findById(2L).isEmpty()).isTrue();
    }

    @Sql("/Insert-members.sql")
    @Test
    void deleteAll() {
        // when
        memberRepository.deleteAll();

        // then
        assertThat(memberRepository.findAll().size()).isZero();
    }

    @Sql("/Insert-members.sql")
    @Test
    void update() {
        // given
        Member member = memberRepository.findById(2L).get();

        // when
        member.changeName("BC");

        // then
        assertThat(memberRepository.findById(2L).get().getName()).isEqualTo("BC");
    }
}