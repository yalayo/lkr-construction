# resource "cloudflare_pages_project" "pages_project" {
#   account_id = "4180cebb0f75e57d434f27a622da70f0"
#   name = "lkrconstruction"
# }

# resource "cloudflare_pages_domain" "frontend" {
#   account_id = "4180cebb0f75e57d434f27a622da70f0"
#   project_name = cloudflare_pages_project.pages_project.id
#   name = "lkrconstruction.com"
# }