package lucasmayrink.hamburguer.repository

import lucasmayrink.hamburguer.controller.dto.AlimentoDto
import lucasmayrink.hamburguer.domain.Alimento
import lucasmayrink.hamburguer.repository.model.AlimentoEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AlimentoRepository: JpaRepository<AlimentoEntity, Long> {


    fun findByNome(pesquisa: String): AlimentoEntity

}