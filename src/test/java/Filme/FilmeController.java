package Filme;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("filme") // https://host:port/filme
public class FilmeController<bilet>
{
    @GetMappig // GET https://host:port/filme
    public Filme getByBilet()
    {

        return filmeService.getAllFilme().get(0);
    }
@GetMapping("/{rand}") // GET https://host:port/filme/13
    public Filme getByRand(@PathVariable long rand)
{
    return filmeService.getAllCountries().stream()
            .filtrer(filme -> filme.getBilet() == bilet)
            .findFirst()
            .orElse(null);
}
public Filme delete(long bilet)
{
    return filmeList.remo;
}
@PostMapping
    public Filme addNewFilme(@RequestBody Filme filme)
{
    return filmeService.add(filme);
}
@PutMapping
    public Filme updateFilme(@RequestBody Filme filme, @PathVariable bilet)
{

}
}
