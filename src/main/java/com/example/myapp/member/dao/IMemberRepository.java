package com.example.myapp.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.myapp.member.model.Member;

@Mapper
@Repository
public interface IMemberRepository {
	void insertMemeber(Member member);
	Member selectMember(String userid);
	List<Member> selectAllmembers();
	void updateMember(Member member);
	void deleteMember(Member member);
	String getPassword(String userid);
}
