package com.chenddd.thymeleaf.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.autoconfigure.ConfigurationCustomizer;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 金鱼
 * @title: MyBatisConfig
 * @projectName thymeleaf
 * @description: TODO
 * @date 2022/3/1810:35
 */
@Configuration
public class MyBatisConfig {
    /**
     * 新的分页插件,一缓和二缓遵循mybatis的规则,需要设置 MybatisConfiguration#useDeprecatedExecutor = false 避免缓存出现问题(该属性会在旧插件移除后一同移除)
     */
  @Bean
    public MybatisPlusInterceptor paginationInterceptor(){
      MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();

      PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor();
      paginationInnerInterceptor.setOverflow(true);
      paginationInnerInterceptor.setMaxLimit(500L);
      mybatisPlusInterceptor.addInnerInterceptor(paginationInnerInterceptor);

      return mybatisPlusInterceptor;
  }
}
