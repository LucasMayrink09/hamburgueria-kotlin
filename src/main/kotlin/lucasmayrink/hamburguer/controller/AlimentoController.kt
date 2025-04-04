package lucasmayrink.hamburguer.controller

import lucasmayrink.hamburguer.controller.dto.AlimentoDto
import lucasmayrink.hamburguer.domain.Alimento
import lucasmayrink.hamburguer.service.AlimentoService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/alimento")
class AlimentoController(
    private val alimentoService: AlimentoService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun salvar(@Valid @RequestBody alimentoDto: AlimentoDto): Alimento {
        return alimentoService.salvar(alimentoDto)
    }

    @GetMapping
    fun buscarTodos(): List<Alimento>{
        return alimentoService.buscarTodos()
    }

    @GetMapping("/{pesquisa}")
    fun buscarComFiltro(@PathVariable pesquisa: String): Alimento{
        return alimentoService.buscarComFiltro(pesquisa)
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deletar(@PathVariable id: Long){
        return alimentoService.deletar(id)
    }

    @PutMapping("/{id}")
    fun atualizar(@PathVariable id: Long, @RequestBody alimentoDto: AlimentoDto): Alimento?{
        return alimentoService.atualizar(id, alimentoDto)
    }
}
