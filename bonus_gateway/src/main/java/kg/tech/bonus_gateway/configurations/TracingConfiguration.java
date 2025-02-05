package kg.tech.bonus_gateway.configurations;

import brave.Tracing;
import brave.sampler.Sampler;
import io.micrometer.tracing.Tracer;
import io.micrometer.tracing.brave.bridge.BraveBaggageManager;
import io.micrometer.tracing.brave.bridge.BraveCurrentTraceContext;
import io.micrometer.tracing.brave.bridge.BraveTracer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TracingConfiguration {

    @Bean
    public Tracing braveTracing() {
        return Tracing.newBuilder()
                .sampler(Sampler.ALWAYS_SAMPLE)
                .build();
    }

    @Bean
    public Tracer tracer(@Qualifier("braveTracing") Tracing tracing) {
        return new BraveTracer(
                tracing.tracer(),
                new BraveCurrentTraceContext(tracing.currentTraceContext()),
                new BraveBaggageManager()
        );
    }

}
