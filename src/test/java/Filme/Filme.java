package Filme;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Getter
@Builder
public class Filme
{
    private final String film;
    private final long sala;
    private final String bilet;
    private final long loc;
    private final List<String> rand;


}
