package cn.lianhy.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Mapping;

@Document(indexName = "test_lianhy",type = "lianhy")
@Mapping(mappingPath = "test.json")
public class TestItem {

    @Id
    private Integer id;

    private String name;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public TestItem(Integer id, String name, String content) {
        this.id = id;
        this.name = name;
        this.content = content;
    }

    public TestItem() {
    }

    @Override
    public String toString() {
        return "TestItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
