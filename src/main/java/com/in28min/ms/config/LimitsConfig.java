package com.in28min.ms.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@ConfigurationProperties("limits-service")
@Data
@NoArgsConstructor
@Component
public class LimitsConfig {
	private int minimum;
	private int maximum;
}
