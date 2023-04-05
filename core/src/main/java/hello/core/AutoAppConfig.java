package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan (
    excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
    // @Configuration 어노테이션에도 타고 들어가보면 @Component가 붙어있어서 ComponentScan 대상이 된다.
    // AppConfig, TestConfig에 @Configuration이 붙어있어서 의도하지 않은 다른 컴포넌트들도 스프링 컨테이너에 등록될 수 있기 때문에 Configuration.class는 제외하도록 설정해주었다.
)
public class AutoAppConfig {

}
