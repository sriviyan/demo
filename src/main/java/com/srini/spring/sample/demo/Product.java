package com.srini.spring.sample.demo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product")
public class Product {
    @Column(name = "name")
    private String name;
    @Column(name = "desc")
    private String desc;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Product(String name, String desc, long id) {
        this.name = name;
        this.desc = desc;
        this.id = id;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(name, product.name) && Objects.equals(desc, product.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, desc, id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", id=" + id +
                '}';
    }
}
