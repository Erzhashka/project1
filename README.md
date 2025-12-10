# First Project

Simple Spring Boot MVC demo.

What this project contains:

- A Spring Boot application (`FirstProjectApplication`).
- `GreetingController` with two GET endpoints:
  - `/api/message` — returns plain text using `@ResponseBody`.
  - `/greeting` — returns the `greeting.html` Thymeleaf template and shows an image.
- Thymeleaf templates in `src/main/resources/templates`.
- Static assets in `src/main/resources/static/images` (example `vistula.svg`).

How to run locally

Windows (cmd.exe):

```cmd
gradlew.bat clean build
gradlew.bat bootRun
```

Open http://localhost:8080/greeting to see the page, or http://localhost:8080/api/message for the plain text response.

Notes

- The project uses `spring-boot-starter-thymeleaf` for server-side rendering.
- Add screenshots to `docs/` if desired.

