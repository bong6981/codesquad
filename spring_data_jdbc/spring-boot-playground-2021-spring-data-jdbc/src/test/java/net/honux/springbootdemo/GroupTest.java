package net.honux.springbootdemo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional
public class GroupTest {
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private UserRepository userRepository;
    private Logger logger = LoggerFactory.getLogger(GroupTest.class);

    @Test
    void groupRead() {
        Group group = groupRepository.findById(1L).get();
        assertThat(group.getId()).isGreaterThan(0);
        logger.info("read group {}", group);
    }

    @Test
    void readGroupFromUser() {
        User user = userRepository.findById(1L).get();
        Long groupId = user.getGroupId();
        Group group = groupRepository.findById(groupId).get();
        assertThat(group.getId()).isGreaterThan(0);
        logger.info("read group from user {} : {}", user, group);
    }
}
