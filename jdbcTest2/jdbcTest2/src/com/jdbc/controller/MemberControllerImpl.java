package com.jdbc.controller;

import java.util.List;

import com.jdbc.common.MemberController;
import com.jdbc.model.dto.MemberDTO;
import com.jdbc.model.service.MemberService;
import com.jdbc.view.MainView;

public class MemberControllerImpl implements MemberController {

	//private MemberDao dao=new MemberDao();
	private MemberService service=new MemberService();
	
	@Override
	public void mainMenu() {
		new MainView().mainMenu();
	}
	
	
	
	@Override
	public void selectMemberById() {
		String id=new MainView().inputData("아이디");
		MemberDTO m=service.selectMemberById(id);
		new MainView().printMember(m);
		
	}

	@Override
	public void selectAllMember() {
		//dao.selectAllMember();
		List<MemberDTO> members=service.selectAllMember();
		new MainView().printMembers(members);
	}

	@Override
	public void insertMember() {
		MemberDTO m=new MainView().addMember();
		int result=service.insertMember(m);
		new MainView().printMsg(result>0?"회원가입성공 :) ":"회원가입실패 :( ");
	}

	@Override
	public void updateMember() {
		// TODO Auto-generated method stub
		MemberDTO m=new MainView().updateData();
		int result=service.updateMember(m);
		new MainView().printMsg(result>0?"회원수정 성공 :) ":"회원수정 실패 :( ");
	}

	@Override
	public void selectMemberByName() {
		// TODO Auto-generated method stub
		String name=new MainView().inputData("이름");
		
		List<MemberDTO> m=service.selectMemberByName(name);
		
		new MainView().printMembers(m);
		
	}

	
	
	
	
	
	
	
}
