package Filme;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Long.parseLong;

@Component
public class FilmeReader
{
    public List<Filme>  readFilme()
    {

        List<Filme> filme = new ArrayList<>();
        try
        {
            Scanner scanner = new Scanner(new File("filme.txt"));
            long loc = 1;
            while (scanner.hasNext())
{
        String line =scanner.nextLine();
         filme.add(fromLine(line, loc++));

}
            String line = scanner.nextLine();

        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return filme;
    }




    private Filme fromLine(String line, long loc)
    {
        String[] tokens = line.split("|");
        String[] rand = null;


        Filme.FilmeBuilder filmeBuilder = Filme.builder()
                .film(tokens[0])
                .sala(parseLong(tokens[1]))
                .bilet(tokens[2])
                .loc(parseLong(tokens[3]));
        if(tokens.length == 5)
        {
            filmeBuilder.rand(Arrays.asList(tokens[4].split("~")));
        }
        return filmeBuilder.build();


    }

}
