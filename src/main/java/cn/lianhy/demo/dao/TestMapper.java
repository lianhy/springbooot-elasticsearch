package cn.lianhy.demo.dao;

import cn.lianhy.demo.entity.TestItem;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface TestMapper extends ElasticsearchRepository<TestItem,Integer> {

}
