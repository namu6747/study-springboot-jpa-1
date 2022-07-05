package jpabook.jpashop;

import jpabook.jpashop.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    @Transactional
    public void testMember() throws Exception {
        //
        Member member = new Member();
        member.setName("memberA");
        //
        Long saveId = memberRepository.save(member);
        Member findMember = memberRepository.find(saveId);
        //
        assertThat(findMember.getId()).isEqualTo(member.getId());
        assertThat(findMember.setName()).isEqualTo(member.setName());
    }
}