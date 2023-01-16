package com.flowable.flowableproject.config;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @BelongsProject: flowableproject
 * @BelongsPackage: com.flowable.flowableproject.config
 * @Author: wangbin
 * @CreateTime: 2022-12-28  10:09
 * @Description:  mybatisplus  快速生成代码
 * @Version: 1.0
 */
public class MybatisPlusGenerator {
    public static void main(String[] args) {

        FastAutoGenerator.create("jdbc:mysql://localhost:3306/flowable?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=true"
                , "root", "root")
                .globalConfig(builder -> {
                    builder.author("bin") // 设置作者
                            //.enableSwagger() // 开启 swagger 模式
                            .outputDir("D://wangbincon"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.flowable") // 设置父包名
                            .moduleName("flowableproject") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D://wangbincon")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("sys_user_role","sys_user","sys_role_menu","sys_role","sys_oplog","sys_menu") // 设置需要生成的表名
                            .addTablePrefix("sys_"); // 设置过滤表前缀

                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}
