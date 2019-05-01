package com.itcast.zhangpeng;

import javax.persistence.*;

@Table(name = "customer")
@Entity
public class Customer {
    private String cust_name;
    private Integer cust_id;
    private User user;


    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getCust_id() {
        return cust_id;
    }

    public void setCust_id(Integer cust_id) {
        this.cust_id = cust_id;
    }
    @JoinColumn(name = "user_id")
    @ManyToOne()
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cust_name='" + cust_name + '\'' +
                ", cust_id=" + cust_id +
                '}';
    }
}
