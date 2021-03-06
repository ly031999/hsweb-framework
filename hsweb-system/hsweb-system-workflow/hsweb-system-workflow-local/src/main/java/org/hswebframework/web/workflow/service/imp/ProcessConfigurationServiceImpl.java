package org.hswebframework.web.workflow.service.imp;

import org.activiti.engine.repository.ProcessDefinition;
import org.hswebframework.web.workflow.service.config.ProcessConfigurationService;
import org.hswebframework.web.workflow.service.config.CandidateInfo;
import org.hswebframework.web.workflow.service.config.ActivityConfiguration;
import org.hswebframework.web.workflow.service.config.ProcessConfiguration;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


/**
 * @author zhouhao
 * @since 3.0.0-RC
 */
@Service
public class ProcessConfigurationServiceImpl implements ProcessConfigurationService {

    static final EmptyActivityConfiguration emptyConfiguration = new EmptyActivityConfiguration();

    @Override
    public ActivityConfiguration getActivityConfiguration(String doingUser, String processDefineId, String activityId) {

        return emptyConfiguration;
    }

    @Override
    public ProcessConfiguration getProcessConfiguration(String processDefineId) {

        return emptyConfiguration;
    }

    private final static class EmptyActivityConfiguration implements ActivityConfiguration, ProcessConfiguration {

        @Override
        public String getFormId() {
            return null;
        }

        @Override
        public boolean canClaim(String userId) {
            return false;
        }

        @Override
        public List<CandidateInfo> getCandidateInfo() {
            return Collections.emptyList();
        }

        @Override
        public void assertCanStartProcess(String userId, ProcessDefinition definition) {
            
        }
    }
}
