package com.feb.join.entity;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Alias("EmailAuth")
public class EmailAuth {

	private int idx;
	private int memberIdx;
	private String memberId;
	private String email;
	private String link;
	private String sendDtm;

}