package com.danhy989.SpringdataElasticsearch;

import com.danhy989.SpringdataElasticsearch.dto.Author;
import com.danhy989.SpringdataElasticsearch.entities.Article;
import com.danhy989.SpringdataElasticsearch.repository.ArticleRepository;
import com.danhy989.SpringdataElasticsearch.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import static java.util.Arrays.asList;

@SpringBootApplication
public class SpringdataElasticsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdataElasticsearchApplication.class, args);
	}

}
