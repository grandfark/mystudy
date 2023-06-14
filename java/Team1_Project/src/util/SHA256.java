package util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 {
    public String encrypt(String text) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256"); //sha-256 인스턴스 생성
        md.update(text.getBytes());//받은 문자열 byte 배열로 변환 후 메소드를 사용하여 값 입력
        return bytesToHex(md.digest());// 16진수로 변환된 암호문 반환
    }

    private String bytesToHex(byte[] bytes) {
        StringBuilder builder = new StringBuilder();
        for (byte b : bytes) {//bytes 를 배열을 순환하며 반복
            builder.append(String.format("%02x", b)); 
            //byte값을 16진수 문자열로 변환 왼쪽에 0 오른쪽에 16진수 소문자 출력 의미
        }
        return builder.toString();//byte값을 16진수로 인코딩한 문자열이 반환
    }

}