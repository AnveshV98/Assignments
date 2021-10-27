package com.yash.SpringAopDemo.helper;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	
	Logger log = Logger.getAnonymousLogger();
	long starttime = System.currentTimeMillis();
	
	@Before("execution(public void add())")
	
	public void log() {
		long timetaken = System.currentTimeMillis()-starttime;
		System.out.println(timetaken);
		log.info("Added value");
		
	}
	@After("execution(public void add())")
	public void log2(JoinPoint jp) {
		
		log.info("after method");
		
		long timetaken = System.currentTimeMillis()-starttime;
		log.info(jp.getSignature().getName());
		System.out.println(timetaken);
	}
	
	@AfterThrowing(pointcut  = "execution(* com.yash.SpringAopDemo.service.Calculator.*(..))", 
		      throwing = "error")
	public void afterThrowingAdvice(JoinPoint jp, Throwable error) {
		
		 System.out.println("Method Signature: "  + jp.getSignature());
		System.out.println("Exception: "+error);  
	}
	
	
	@Around("execution(* com.yash.SpringAopDemo.service.Calculator.*(..))")
	public void getAround(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("starting");
		jp.proceed();
		System.out.println("ending");
	}
}
