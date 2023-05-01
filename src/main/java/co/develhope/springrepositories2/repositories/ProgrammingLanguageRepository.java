package co.develhope.springrepositories2.repositories;

import co.develhope.springrepositories2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-program-languages", collectionResourceDescription = @Description("Repository per la tabella dei linguaggi di programmaione"))
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {

}
