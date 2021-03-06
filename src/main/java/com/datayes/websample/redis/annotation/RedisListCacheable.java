package com.datayes.websample.redis.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.datayes.websample.redis.type.RedisOpsType;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
@Inherited
public @interface RedisListCacheable {
	/**
	 * operation type
	 * 
	 * @return
	 */
	RedisOpsType opsType();
	
	/**
	 * key for list
	 * 
	 * @return
	 */
	String key();
	
	/**
	 * class type for list value
	 * @return
	 */
	String valueType() default "";
	
	/**
	 * time to expire, seconds for unit
	 * 
	 * @return
	 */
	long expiration() default -1;
}
