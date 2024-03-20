/*
객체 통신
객체(Car, Tv, Tank) >> 프로세스, 네트워크, 파일 간에도 통신 >> 통신을 위해 직렬화, 역직렬화

직렬화 : 객체를 분해해서 줄을 세워 보내는 과정
역직렬화 : 객체를 다시 조립하는 행위

모든 자원(class)이 직렬화가 가능한건 아님
직렬화를 지원하는 클래스 입니다라고 선언해야함
ex) UserInfo implements Serializable

실습) 파일 기반 > 파일에 직렬화한 자원을 WRITE
	 파일 기반 > 파일에 직렬화한 자원을 다시 복원 READ
 */
package kr.or.kosa;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserInfo implements Serializable{
	private String name;
	private String pwd;
	private int age;
}