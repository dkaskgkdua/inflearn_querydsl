package study.querydsl.repository;


import study.querydsl.dto.MemberSearchCondition;
import study.querydsl.dto.MemberTeamDto;

import java.util.List;

public interface MemberRepositoryCustom {
//    List<Member> findMemberCustom();
    List<MemberTeamDto> search(MemberSearchCondition condition);
}
