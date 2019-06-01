package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by 廖师兄
 * 2017-07-23 23:02
 */
@Data
@Entity
public class SellerInfo {

    @Id
    @Column(name = "id")
    private String sellerId;

    private String username;

    private String password;

    private String openid;

}
