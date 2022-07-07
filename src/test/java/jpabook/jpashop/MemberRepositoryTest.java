package jpabook.jpashop;

import jpabook.jpashop.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void testMember() throws Exception {
        //
        Member member = new Member();
        member.setName("memberA");
        //
        Long saveId = memberRepository.save(member);
        Member findMember = memberRepository.find(saveId);
        //
        assertThat(findMember.getId()).isEqualTo(member.getId());
        assertThat(findMember.getName()).isEqualTo(member.getName());

        Assertions.assertThat(findMember).isEqualTo(member);

        System.out.println("findMember = " + findMember);
        System.out.println("member = " + member);

    }
}