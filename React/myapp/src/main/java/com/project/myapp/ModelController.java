package com.project.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class ModelController {

    @RestController
    @RequestMapping("/api/model")
    public class modelController {
        @Autowired
        private ModelRepository ModelRepository;

        @PostMapping
        public Model createModel(@RequestBody Model model) {

            return ModelRepository.save(model);
        }

        @PutMapping("/{id}")
        public ResponseEntity<Model> updateProduct(@PathVariable Long id, @RequestBody Model updatedModel) {
            if (!ModelRepository.existsById(id)) {
                return ResponseEntity.notFound().build();
            }
            updatedModel.setId(id);
            return ResponseEntity.ok(ModelRepository.save(updatedModel));
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteModel(@PathVariable Long id) {
            if (!ModelRepository.existsById(id)) {
                return ResponseEntity.notFound().build();
            }
            ModelRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
    }

}
