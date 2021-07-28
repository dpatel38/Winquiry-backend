package com.win.winquiry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.win.winquiry.model.Choice;

@Repository
@Transactional
public interface ChoiceRepository extends JpaRepository<Choice, Long> {

//    @Query("DELETE FROM choices WHERE poll_id = :pollId")
//    List<Choice> deleteByPollId(@Param("pollId") Long pollId);
    void deleteByPollId(Long Id);
}
