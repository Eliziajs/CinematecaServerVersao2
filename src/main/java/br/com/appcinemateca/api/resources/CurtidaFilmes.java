package br.com.appcinemateca.api.resources;

import br.com.appcinemateca.api.config.serialization.converter.MediaType;
import br.com.appcinemateca.api.domain.Curtida;
import br.com.appcinemateca.api.dto.CurtidaDTO;
import br.com.appcinemateca.api.repositories.CurtidaRepository;
import br.com.appcinemateca.api.services.interfaces.CurtidaServices;
import br.com.appcinemateca.api.services.interfaces.FilmeServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping(value ="/filmesCurtidos")
public class CurtidaFilmes {
    @Autowired
    private CurtidaServices service;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private CurtidaRepository repository;

    @GetMapping(produces = {MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML, MediaType.APPLICATION_YML})
    @Operation(summary = "Finds all likes", description = "Finds all likes",
            tags = {"likes"},
            responses = {@ApiResponse(description = "Success", responseCode = "200",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = CurtidaDTO.class))
                            )
                    }),
                    @ApiResponse(description = "Bad Request", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Unauthorized", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Not Found", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Internal Error", responseCode = "500", content = @Content)
            }
    )

    public ResponseEntity Long () {
        Long list = service.qtd();
        // return result;
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value={"/id"},produces = {MediaType.APPLICATION_JSON,
            MediaType.APPLICATION_XML, MediaType.APPLICATION_YML})
    @Operation(summary = "Finds all likes", description = "Finds all likes",
            tags = {"likes"},
            responses = {@ApiResponse(description = "Success", responseCode = "200",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = CurtidaDTO.class))
                            )
                    }),
                    @ApiResponse(description = "Bad Request", responseCode = "400", content = @Content),
                    @ApiResponse(description = "Unauthorized", responseCode = "401", content = @Content),
                    @ApiResponse(description = "Not Found", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Internal Error", responseCode = "500", content = @Content)
            }
    )
    public ResponseEntity quantidade(@PathVariable Long id) {
     Long list = service.quantidade(id);
        // return result;
        System.out.println("Funciona");
        return ResponseEntity.ok().body(list);
    }

}


