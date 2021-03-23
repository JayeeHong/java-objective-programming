package fastcampus.spring.batch.part1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class HelloConfiguration {
    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;

    public HelloConfiguration(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory) {
        this.jobBuilderFactory = jobBuilderFactory;
        this.stepBuilderFactory = stepBuilderFactory;
    }

    @Bean
    public Job helloJob() {
        return jobBuilderFactory.get("helloJob")
                .incrementer(new RunIdIncrementer())
                .start(this.helloStep())
                .build();
    }

    @Bean
    public Step helloStep() {
        return stepBuilderFactory.get("helloStep")
                .tasklet((contribution, chunkContext) -> {
                    log.info("hello spring batch");
                    return RepeatStatus.FINISHED;
                }).build();
    }
}

/*
job : 스프링배치의 실행단위
step: job의 실행단위
하나의 job - 여러개의 step

step은 tasklet이라는 객체로 배치를 실행할 수 있다.
 */