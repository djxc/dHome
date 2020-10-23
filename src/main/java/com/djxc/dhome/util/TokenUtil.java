package com.djxc.dhome.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;
import java.util.HashMap;


/**
 * token 的生成与验证
 */
public class TokenUtil {
    // token过期时间
    private static final long EXPIRE_TIME = 20 * 60 * 1000;
    // token私钥
    private static final String TOKEN_SECRET = "djxcbeihang1025aishihengjiurennai";

    public static void main(String[] args) {
        String token1 = createToken("djxc", "2");
        String token2 = createToken("djxc", "3");
        String token3 = createToken("djxc", "2");
        System.out.println(token3.equals(token1));
        boolean isverify = verify(token2);
        System.out.println(isverify);
    }

    /**
     * 生成加密的token
     * 需要传入用户名以及密码参数
     * 1、计算过期的时间
     * 2、通过token私钥定义算法
     * 3、生成加密的token字符串并返回
     * @param userName 用户名
     * @param userID 密码
     * @return String 加密的token字符串
     */
    public static String createToken(String userName, String userID) {
        Date data = new Date(System.currentTimeMillis() + EXPIRE_TIME);
        Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
        HashMap<String, Object> header = new HashMap<>(2);
        header.put("typ", "JWT");
        header.put("alg", "HS256");
        String token = JWT.create().
                withHeader(header).withClaim("username", userName)
                .withClaim("userID", userID).withExpiresAt(data).sign(algorithm);
        System.out.println(token);
        return token;
    }

    /**
     * 验证传递过来的token是否正取
     * 1、通过秘钥生成算法
     * 2、根据算法生成验证对象
     * 3、如果验证通过则返回true
     * @param token 加密的token
     * @return boolean 是否正确
     */
    public static boolean verify(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier =JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            System.out.println(jwt);
            return true;
        }catch (IllegalArgumentException e){
            return false;
        }catch (JWTVerificationException e){
            return false;
        }
    }
}
