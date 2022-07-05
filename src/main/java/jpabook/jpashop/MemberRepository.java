package jpabook.jpashop;

import jpabook.jpashop.member.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member){
        em.persist(member);
        System.out.println("Save member = " + member);
        return member.getId();
    }

    public Member find(Long id){
        System.out.println("id = " + id);
        return em.find(Member.class, id);

    }


}
