package Filme;

import lombok.RequiredArgsConstuctor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstuctor

public class FilmeService
{
    private final FilmeReader filmeReader;
    private final List<Filme> filmeList = new ArrayList<>()
    @PostConstructor
    public void init()
    {
        System.out.println("Post construct in Filme Service");
        List<Filme> filme = filmeReader.readFilme();
        filmeRepository.
        filmeList.addAll(filmeReader.readFilme());
    }
    public List<Filme> getAllFilme()
    {
        return filmeList;
    }
    public List<Filme> getByBilet(String bilet)
    {
        filmeList.stream()
                .filter(filme -> filme.getBilet().equals(bilet))
                .toList();
    }
    public Filme delete(long bilet)
    {
        Filme filme = getByBilet(bilet);
        filmeList.remove(filme);
        return filme;
    }
    public Filme add(Filme filme)
    {
        filmeList.add(Filme);
        return filme;
    }
    public Filme update(Filme filme)
    {
        getBilet();
    }

    private void getBilet() {
    }
    public Filme update(Filme filme, long bilet)
    {
        Filme existingFilme = delete(bilet);
        return add(Filme.builder()
                .film(film)
                .sala(existingFilme.getName()))
                .bilet(bilet.GetBilet())
                .loc(filme.getLoc())
                .rand(filme.getRand())
                .build();
    }


}
