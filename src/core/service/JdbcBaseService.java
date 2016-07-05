package core.service;

import core.dao.JdbcBaseDao;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 */
@Transactional
public class JdbcBaseService {

    @Resource
    protected JdbcBaseDao jdbcBaseDao;

}
