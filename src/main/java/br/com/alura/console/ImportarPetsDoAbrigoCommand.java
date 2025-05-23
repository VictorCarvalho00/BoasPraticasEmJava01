package br.com.alura.console;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.service.PetService;

import java.io.IOException;

public class ImportarPetsDoAbrigoCommand implements Command{
    @Override
    public void execute() {
        try {
            ClientHttpConfiguration client =  new ClientHttpConfiguration();
            PetService petService = new PetService(client);

            petService.importarPetDoAbrigo();
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
