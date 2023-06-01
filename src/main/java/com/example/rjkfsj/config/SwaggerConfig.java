package com.example.rjkfsj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.swing.text.Document;

@Configuration  //告诉springboot 这个类是配置类
@EnableSwagger2 //启用功能
public class SwaggerConfig {
    @Bean   //配置swagger2相关的bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())     //做基本的配置 导入apiInfo()的内容
                .select()
                .apis(RequestHandlerSelectors.basePackage("com"))   //com包下所有API都交给swagger2管理   即com.example的com
                .paths(PathSelectors.any()).build();
    }

    //API文档页面显示信息
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("演示项目API")   //标题
                .description("演示项目")    //描述
                .version("1.0")     //版本
                .build();
    }
}
