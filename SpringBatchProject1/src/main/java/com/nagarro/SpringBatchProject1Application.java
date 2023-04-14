package com.nagarro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableBatchProcessing
public class SpringBatchProject1Application {

	private Logger logger= LoggerFactory.getLogger(SpringBatchProject1Application.class);
	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	@Autowired
	private StepBuilderFactory stepBuilderFactory;


	@Bean
	public Job deliveryJob(){
		return this.jobBuilderFactory.get("deliveryJob").start(packageStep()).build();
	}

	@Bean
	public Step packageStep() {
		return this.stepBuilderFactory.get("packageStep").tasklet(new Tasklet() {
			@Override
			public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
				logger.info("The Item has been packed");
				return RepeatStatus.FINISHED;
			}
		}).build();
	}

	//tasklet has an inbuild method which execute again and again

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchProject1Application.class, args);
	}

}
