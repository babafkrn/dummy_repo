/**
 * 
 */
package org.ness.com.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.ness.com.springav.model.AjaxResponseBody;
import org.ness.com.springav.model.Department;
import org.ness.com.springav.model.DepartmentSearchCriteria;
import org.ness.com.springav.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author localadmin
 *
 */
@RestController
public class DepartmentRestController {

	DepartmentService departmentService;

    @Autowired
    public void setUserService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/api/search")
    public ResponseEntity<?> getSearchResultViaAjax(
            @Valid @RequestBody DepartmentSearchCriteria search, Errors errors) {

        AjaxResponseBody result = new AjaxResponseBody();

        //If error, just return a 400 bad request, along with the error message
        if (errors.hasErrors()) {

            result.setMsg(errors.getAllErrors()
                        .stream().map(x -> x.getDefaultMessage())
                        .collect(Collectors.joining(",")));

            return ResponseEntity.badRequest().body(result);

        }

        List<Department> departmentsList = departmentService.findDepartmentByNo(search.getDeptno());
        
        if (departmentsList.isEmpty()) {
            result.setMsg("no departments found!");
        } else {
            result.setMsg("success");
        }
        result.setResult(departmentsList);

        return ResponseEntity.ok(result);

    }
}
