package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // 스프링 컨테이너에 등록된다.
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Autowired // 스프링이 MemberRepository 타입에 맞는 것을 찾아와서 자동으로 의존 관계를 주입해준다.
               // ac.getBean(MemberRepository.class)
    public MemberServiceImpl(MemberRepository memberRepository) {
        // 생성자 주입
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    // 테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
