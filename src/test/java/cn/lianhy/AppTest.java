package cn.lianhy;

import cn.lianhy.demo.dao.TestMapper;
import cn.lianhy.demo.entity.TestItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class AppTest {

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Test
    public void createIndex() {
        elasticsearchTemplate.createIndex(TestItem.class);
    }

    @Test
    public void deleteIndex() {
        elasticsearchTemplate.deleteIndex(TestItem.class);
    }

    @Test
    public void save(){
        testMapper.save(new TestItem(1,"haha","hahaha"));
    }

    @Test
    public void saveAll(){
        List<TestItem> list = new ArrayList<>();
        for(int i=1;i<10;i++){
            list.add(new TestItem(i,"haha"+i,"hahaha"+i));
        }
        testMapper.saveAll(list);

    }

    @Test
    public void deleteAll(){
        testMapper.deleteAll();
    }

    @Test
    public void findAll(){
        Iterable<TestItem> all = testMapper.findAll(Sort.by("id"));
        all.forEach(item -> System.out.println(item.toString()));
    }
}
