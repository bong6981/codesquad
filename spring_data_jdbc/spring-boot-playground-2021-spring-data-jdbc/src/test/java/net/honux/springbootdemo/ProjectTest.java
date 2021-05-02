package net.honux.springbootdemo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Set;

@SpringBootTest
@Transactional
public class ProjectTest {

    Logger logger = LoggerFactory.getLogger(ProjectTest.class);

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    void read() {
        Project project = projectRepository.findById(1L).get();
        logger.info("project : {}", project.toString());
        User user = userRepository.findById(1L).get();
        Set<WorksOn> worksOns = user.getWorksOns();
        for(WorksOn worksOn : worksOns) {
            Project p = projectRepository.findById(worksOn.getProjectId()).get();
            logger.info("I go him: {}", p);
        }
    }
}
