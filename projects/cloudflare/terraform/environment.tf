resource "cloudflare_workers_secret" "example_secret" {
  account_id  = var.cloudflare_account_id
  name        = "GOOGLE_APPLICATION_CREDENTIALS"
  secret_text = var.google_application_credentials
  script_name = cloudflare_workers_script.score_backend.name
}