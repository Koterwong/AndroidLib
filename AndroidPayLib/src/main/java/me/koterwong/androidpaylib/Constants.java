/*
 * PayConstants     2016/12/2 17:11
 * Copyright (c) 2016 Koterwong All right reserved
 */
package me.koterwong.androidpaylib;

/**
 * Created by Koterwong on 2016/12/2 17:11
 */
public interface Constants {
  interface AliPay {
    /** 是否使用RSA2加密方式 */
    boolean USER_RSA2 = false;
    /** 支付宝AppID */
    String APPID = "2017062507563214";
    /** 商户私钥，pkcs8格式 */
    String RSA_PRIVATE = "/MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAJm0+JC3vn+A9h9iBAY3barEn1/GaVQoSaIe1nA6ZjMWyaChDEpd3uL9trYZANHqE2efV42ZKJYYfZtEMd1vqRPuHiN0QgRe1SqFV6X55Mju8EYVlZvVeGBQI5TRRFvz4YPcc2UQ/PoWPRVX5PpLhUa2bahyTIywREamJv+p6u1lAgMBAAECgYARshT/zDehRD6RpF4kPRNiGpriktwjdTPs9zHm38JOVWxHEuNwWFhFt8HmOwCuKg2r21tgEObsSMuFKZe4D5feZk7cdckdigxfS6LJEsvzprL8VZtCZBX7ans9lMim1ISOlDHuJ+93sstUNrUQVrFJME7+iU8w6pFL6ktE+vRpYQJBAOdluz1GLz239SZz69krFwszUUzaSmoJCL1S0ZbglZYwTxH7A5TxZLkaYC/wI2XZRFgaGdEnYmvb0s2UdCY+kF0CQQCqDKDsYvfMzTlxJBoHCik7fiasuDJUC2+UfVx0O2lb2MyIflcsqZKj+t+z6D/8YjdQCSeKYzcIcmlXdqU5uiCpAkEAiQQOCMxEMNF6kdhWMPN446LxYwZmxb6vtBsUC7jUGmhkiYsOpeUB9TEO/5O8AhTSiTB7VQNzHda+Tgi3deXZ6QJBAIjhlX/ywml3IS/z0YetJDehelw6ATkp421x48QkNtEaGLoeiOmIrmOVBBF7eFYecUvZspxw9NG11xnyhVmMe9ECQHw+Jxcz43sd7rSjml+7aukIhsHI4EWqleSWK6+wylDEdbyXEMDgvhErMx8TZu32VjZtrQvUPYYJkE9iAx7SMUk=";
    /** 支付宝回调后台的NotifyUrl */
    String NOTIFY_URL = "http://electric.jzbwlkj.com/index.php/api/Notify/index.html";
    /** 支付宝公钥 */
    String RSA_PUBLIC = "";
  }

  interface WxPay {
    /** 微信 AppID，在微信开放平台创建应用，并开通支付能力 */
    String APP_ID = "wx052f71622ceec18d";
    /** 商户号 */
    String WX_SHOP_NUM = "1440957102";
    /** 微信商户密钥 */
    String KEY = "fuyingjiangshuidianyunguanjia221";
  }
}
