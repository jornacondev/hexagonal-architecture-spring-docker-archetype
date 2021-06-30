#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.infrastructure.db.springdata.repository;

import ${package}.application.repository.SampleRepository;
import ${package}.infrastructure.db.springdata.mapper.SampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO: Delete this sample class
 */

@Service
public class SampleDboRepository implements SampleRepository {

    private final SampleMapper sampleMapper;

    private final SpringDataSampleRepository springDataSampleRepository;

    @Autowired
    public SampleDboRepository(SpringDataSampleRepository springDataSampleRepository, SampleMapper sampleMapper) {
        this.springDataSampleRepository = springDataSampleRepository;
        this.sampleMapper = sampleMapper;
    }
}
