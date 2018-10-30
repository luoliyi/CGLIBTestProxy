package Aop;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class SurroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        //前置横切逻辑
       System.out.println("环绕通知前，方法" + methodInvocation.getMethod() + " 被调用在对象" + methodInvocation.getThis() + "上，参数 " + methodInvocation.getArguments());
        System.out.println("获得对象前");
        //调用要执行的方法。方法调用
       Object result = methodInvocation.proceed();
       //后置横切逻辑
        System.out.println("获得对象后");
        System.out.println("环绕通知后，返回值："+ result);

        return result;
    }
}
