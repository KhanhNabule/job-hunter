package vn.khanhvu.jobhunter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import vn.khanhvu.jobhunter.domain.Job;
import vn.khanhvu.jobhunter.domain.Skill;

@Repository
public interface JobRepository extends JpaRepository<Job, Long>,
                JpaSpecificationExecutor<Job> {

        List<Job> findBySkillsIn(List<Skill> skills);
}
