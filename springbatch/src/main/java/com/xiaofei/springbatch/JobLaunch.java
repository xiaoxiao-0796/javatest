package com.xiaofei.springbatch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/8/3 0003 ProjectName: javatest
 */
public class JobLaunch {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "beans.xml");
        JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("csvJob");

        try {
            /* 运行Job */
//            JobExecution result = launcher.run(job, new JobParametersBuilder().addString("outputFile",
//                    "C:\\Users\\Administrator\\Desktop\\outputFile.csv").toJobParameters());
            JobExecution result = launcher.run(job, new JobParameters());
            /* 处理结束，控制台打印处理结果 */
            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
