package com.example.routeservice.service;


import com.example.routeservice.dto.RouteDto;

public interface RouteService {
	RouteDto addRoute(RouteDto routeDto);

	String modifyRoute(int routeId, RouteDto routeDto);

	String deleteRoute(int routeId);

	RouteDto viewRouteById(int routeId);

}
